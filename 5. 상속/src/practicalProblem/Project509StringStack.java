package practicalProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project509StringStack implements Project509Stack {

    List<String> words;
    int capacity;


    public Project509StringStack(List<String> words, int capacity) {
        this.words = words;
        this.capacity = capacity;
    }

    public static void main(String[] args) {

        List<String> words = new ArrayList<>() {
        };
        int capacity;

        Scanner scan = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력>>");
        capacity = scan.nextInt();

        Project509StringStack exStack = new Project509StringStack(words, capacity);

        while (true) {

            System.out.print("문자열 입력>>");
            if (exStack.length() < exStack.capacity) {
                exStack.words.add(scan.next());

            } else {

                String trashVal = scan.next();
                if (exStack.push(trashVal)) {
                    break;
                }


                System.out.println("스택이 꽉 차서 푸시 불가!");


            }
        }

        exStack.pop();


    }

    @Override
    public int length() {
        return words.size();
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public String pop() {

        while (true) {
            System.out.print(words.get(words.size() - 1)+ " ");
            words.remove(words.get(words.size()-1));
            if (words.size()==0) {
                break;
            }

        }
        return null;
    }

        @Override
        public boolean push (String val){
            if (val.equals("그만")) {
                return true;

            } else {
                return false;
            }

        }
    }
