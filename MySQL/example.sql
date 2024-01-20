use sakila;

drop FUNCTION if exists sakila.ParseSeconds;
DELIMITER $$
CREATE FUNCTION sakila.ParseSeconds(seconds int)
RETURNS text
DETERMINISTIC
BEGIN
	DECLARE days char(3);
	DECLARE hours, minutes, sec char(2);
	DECLARE result text;
	SET days = cast(floor(seconds/3600/24) as char(3));
	SET hours = cast(floor(mod(seconds/3600/24,1)*24) as char(2));
	SET minutes = cast(floor(mod(mod(seconds/3600/24,1)*24,1)*60) as char(2));
	SET sec = cast(round(mod(mod(mod(seconds/3600/24,1)*24,1)*60,1)*60) as char(2));
	SET result = concat(days, " days ", hours, " hours ", minutes, " minutes ", sec, " seconds");
	RETURN result;
END$$
DELIMITER ;
SELECT sakila.ParseSeconds(500000);

drop FUNCTION if exists sakila.EvenTo;
delimiter $$ 
CREATE FUNCTION EvenTo (num INT) 
RETURNS VARCHAR(256) 
DETERMINISTIC 
BEGIN 
	DECLARE i INT DEFAULT 0; 
	DECLARE result VARCHAR(256); 
	set result = ''; 
	WHILE i < num DO 
	SET i = i + 2; 
	SET result = concat(result, ' ', i); 
	END while; 
	RETURN result; 
END $$ 
delimiter ; 

SELECT EvenTo(100);
