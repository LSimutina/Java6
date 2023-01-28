package ru.netology.javaqa.Java6;

public class SQRService {
    public int calcSQR(int slideStart, int slideEnd) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x=i*i;
            if(x>=slideStart){
                if(x<=slideEnd) {
                    count++;
                }
            }
        }
        return count;
    }
}
