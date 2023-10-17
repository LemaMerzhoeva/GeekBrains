package isp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Payable> paymentServices = new ArrayList<>();
//        paymentServices.add(new InternetPaymentService());
//        paymentServices.add(new CustomPaymentService());

        for (Payable payable: paymentServices){
            payable.payPhoneNumber(2000);
            return;
        }

        CustomPaymentService customPaymentService = new CustomPaymentService();


    }
}
