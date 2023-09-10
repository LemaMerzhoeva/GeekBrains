using Microsoft.AspNetCore.DataProtection.KeyManagement;
using System.Collections;
using System.Net.Sockets;

namespace GBHTable
{

    // K - обобщенный параметр, ключ
    // V - значение, value
    public class HashMap<K, V> : IEnumerable<HashMap<K, V>.Entity<K, V>>
    {
        private static int INIT_BUCKET_COUNT = 16;
        private static double LOAD_FACTOR = 0.5;
        private int size = 0; //истинное количество элементов в хэш-таблице
        private Bucket<K, V>[] buckets;

        

        private int calculateBucketIndex(K key)
        {
            return Math.Abs(key.GetHashCode()) % buckets.Length;
        }


        private void recalculate()
        {
            size = 0;
            Bucket<K, V>[] old = buckets;
            buckets = new Bucket<K, V>[old.Length * 2];
            for (int i = 0; i < old.Length; i++)
            {
                Bucket<K, V> bucket = old[i];
                if (bucket != null)
                {
                    Bucket<K,V>.Node node = bucket.head;
                    while (node != null)
                    {
                        put((K)node.value.key, (V)node.value.value);
                        node = node.next;
                    }
                }
            }
        }


        public V put(K key, V value)
        {
            if (buckets.Length * LOAD_FACTOR <= size)
            {
                recalculate();
            }


            int index = calculateBucketIndex(key);
            Bucket<K, V> bucket = buckets[index];
            if (bucket == null)
            {
                bucket = new Bucket<K, V>();
                buckets[index] = bucket;
            }

            Entity<K, V> entity = new Entity<K, V>();
            entity.key = key;
            entity.value = value;

            V res = (V)bucket.Add(entity);
            if (res == null)
            {
                size++;
            }

            return res;
        }

        public V remove(K key)
        {
            int index = calculateBucketIndex(key);
            Bucket<K,V> bucket = buckets[index];
            if (bucket == null)
            {
                return default(V);
            }
            V res = (V)bucket.remove(key);
            if (res != null)
            {
                size--;
            }
            return res;
        }

        public V get(K key)
        {
            int index = calculateBucketIndex(key);
            Bucket<K,V> bucket = buckets[index];
            if (bucket == null)
            {
                return default(V);
            }
            return (V)bucket.get(key);
        }

        public IEnumerator<HashMap<K, V>.Entity<K, V>> GetEnumerator()
        {
            return (IEnumerator<HashMap<K, V>.Entity<K, V>>)GetEnumerator();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            for (int i = 0; i < buckets.Length; i++)
            {
                foreach (HashMap<K,V>.Entity<K,V> entity in buckets[i].Where(b => b.value is not null))
                    yield return entity;
            }
        }

        public HashMap()
        {
            buckets = new Bucket<K, V>[INIT_BUCKET_COUNT];
        }

        public HashMap(int initCount)
        {
            buckets = new Bucket<K, V>[initCount];
        }

        public class Entity<K, V>
        {
            public K key;
            public V value;
        }


        // Структура связного списка
        class Bucket<K, V> : IEnumerable<HashMap<K, V>.Entity<K, V>>
        {
            public Node head;

            // узел
            public class Node
            {
                public Node next;
                public Entity<K, V> value;
            }

            public V? Add(Entity<K, V> entity)
            {
                Node node = new Node();
                node.value = entity;
                if (head == null)
                {
                    head = node;
                    return default(V);
                }

                Node currentNode = head;
                while (true)
                {
                    if (currentNode.value.key.Equals(entity.key))
                    {
                        V buf = (V)currentNode.value.value;
                        currentNode.value.value = entity.value;
                        return buf;
                    }

                    if (currentNode.next != null)
                    {
                        currentNode = currentNode.next;
                    }
                    else
                    {
                        currentNode.next = node;
                        return default(V);
                    }
                }
            }

            public V remove(K key)
            {
                if (head == null)
                {
                    return default(V);
                }
                if (head.value.key.Equals(key))
                {
                    V buf = (V)head.value.value;
                    head = head.next;
                    return buf;
                }
                else
                {
                    Node node = head;
                    while (node.next != null)
                    {
                        if (node.next.value.key.Equals(key))
                        {
                            V buf = (V)node.next.value.value;
                            node.next = node.next.next;
                            return buf;
                        }
                        node = node.next;
                    }
                    return default(V);
                }
            }


            public V get(K key)
            {
                Node node = head;
                if (node != null)
                {
                    if (node.value.key.Equals(key))
                    {
                        return node.value.value;
                    }
                    node = node.next;
                }
                return default(V);
            }

            public IEnumerator<HashMap<K, V>.Entity<K, V>> GetEnumerator()
            {
                return (IEnumerator<HashMap<K, V>.Entity<K, V>>)GetEnumerator();
            }

            IEnumerator IEnumerable.GetEnumerator()
            {
                Node cur_node = head;
                while (cur_node != null)
                {
                    yield return cur_node.value;
                    cur_node = cur_node.next;
                }
            }
        }
    }
}
