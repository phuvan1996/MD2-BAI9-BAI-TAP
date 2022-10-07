package Baitap2;

public class TriangleClassifier {
    public static String getTriangleClassifier(double canh1, double canh2, double canh3) {
        if (canh1 + canh2 < canh3 + 0.0000001 || canh1 + canh3 < canh2 + 0.0000001 || canh2 + canh3 < canh1 + 0.0000001)
            return "không phải là tam giác";

        if (canh1 == canh2 && canh2 == canh3){
            return "là tam giác đều";
        }

        if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
            return "là tam giác cân";
        }

            if (canh1 * canh1 == canh2 * canh2 + canh3 * canh3
                    || canh2 * canh2 == canh1 * canh1 + canh3 * canh3
                    || canh3 * canh3 == canh1 * canh1 + canh2 * canh2) {
                return "là tam giác vuông";
            }else {
                return "là tam giác thường";
            }
        }
    }