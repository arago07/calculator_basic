package Saving1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator_basic {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            try {
                try{
                    System.out.println("지금부터 연산을 시작하겠습니다. 연산을 중단하려면 exit, \n계속하려면 exit을 제외한 아무거나 치고 enter를 누르세요.");
                    String exit_str = sc.nextLine();
                    if (exit_str.equals("exit")) {
                        System.out.println("연산이 종료됩니다.");
                        exit = true;
                        break;
                    } else {
                        exit = false;
                    }

                }catch (InputMismatchException e){
                }

                System.out.println("연산할 첫 번째 숫자와 연산자, 두 번째 숫자를 차례로 입력하세요. \n이때 숫자는 모두 양의 정수여야 합니다. \n첫 번째 숫자 :");
                int firstNumber = sc.nextInt();
                System.out.println("연산자 : ");
                String operator = sc.next();
                System.out.println("두 번째 숫자 : ");
                int secondNumber = sc.nextInt();

                if (firstNumber >= 0 && secondNumber >= 0) {
                    double answer = 0;
                    switch (operator) {
                        case "+":
                            answer = firstNumber + secondNumber;
                            break;
                        case "-":
                            answer = firstNumber - secondNumber;
                            break;
                        case "*":
                            answer = firstNumber * secondNumber;
                            break;
                        case "/" :
                            if (secondNumber != 0) {
                                answer = (double) firstNumber / secondNumber;
                            } else {
                                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                                calculate();
                            }
                            break;
                        case "%":
                            if (secondNumber != 0) {
                                answer = firstNumber % secondNumber;
                            } else {
                                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                                calculate();
                            }
                            break;
                        default:
                            System.out.println("잘못된 입력. 연산자를 넣어주세요");
                            calculate();
                            return;
                    } System.out.println("결과값 : " + answer);
                } else{
                    System.out.println("양의 정수를 입력해주세요.");
                    calculate();
                }
            } catch(InputMismatchException e){
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요");
                calculate();
            }
        }

    }

}
