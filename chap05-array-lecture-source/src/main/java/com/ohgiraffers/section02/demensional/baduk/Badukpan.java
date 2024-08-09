package main.java.com.ohgiraffers.section02.demensional.baduk;

import java.util.Scanner;

public class Badukpan {

    // 전역필드 = 필드

    public static void main(String[] args) {
        /*
         * 19*19 크기의 바둑판을 생성
         * 사용자로부터 입역을 받아 번갈아 바둑돌을 놓는 간단한 게임 구현
         * */

        //배둑판 배열 만들기

        char[][] badukpan = new char[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                badukpan[i][j] = '.';

            }
        }

        // 바둑판을 출력
        print(badukpan);

        Scanner scr = new Scanner(System.in);

        char currentPayer = '●';

        while (true) {

            System.out.println("행을 입력해 주세요 : (1~19) ");
            int row = scr.nextInt();
            System.out.println("열을 입력해 주세요 : (1~19) ");
            int col = scr.nextInt();

            //위치 유효성 확인
            if (row >= 1 && row <= 19 && col >= 1 && col <= 19 && badukpan[row - 1][col - 1] == '.') {
                badukpan[row - 1][col - 1] = currentPayer;

                // 다음 플레이어에세 넘김
                if (currentPayer == '●') {
                    currentPayer = '○';
                } else {
                    currentPayer = '●';
                }
            }else{
                System.out.println("잘 못 된 위치입니다.");
                continue;
            }
            print(badukpan);


        }
    }
        public static void print( char[][] board){
            for (int i = 0; i < 19; i++) {
                for (int j = 0; j < 19; j++) {
                    System.out.print(board[i][j] + "  ");
                }
                System.out.println();
            }

        }

    }

