package interface1;

import java.util.Scanner;

class LOLUser {
    LOLService service;

    public LOLUser(LOLService service) { // 매개변수의 다형성
        this.service = service;
    }

    public void attack() {

        service.fight();

        // 원딜이 들어오면 서포터에게 도움을 요청
        if (service instanceof RangeDealer) {
            RangeDealer rangeDealer = (RangeDealer) service;
            rangeDealer.help();
        }
    }

}

interface LOLService {
    public abstract void fight();
}

abstract class LOLServiceTmp1 implements LOLService {

    String character;

    public LOLServiceTmp1(String character) {
        this.character = character;
    }
}


class Dealer extends LOLServiceTmp1 {
    public Dealer(String character) {
        super(character);
    }

    @Override
    public void fight() {
        System.out.println(character + "이(가) 몬스터를 향해 공격합니다.");
    }
}

class RangeDealer extends LOLServiceTmp1 {
    public RangeDealer(String character) {
        super(character);
    }

    @Override
    public void fight() {
        System.out.println(character + "이(가) 몬스터를 향해 공격합니다.");
    }

    public void help() {
        System.out.println(character + "이(가) 서포터한테 도움을 요청합니다.");
    }

}

public class Ex06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("(1)근거리 딜러 (2)원거리 딜러");

        int choice = scan.nextInt();

        if(choice == 1) {
            System.out.println("근거리 딜러 캐릭터 이름 : ");
            String charName = scan.next();
            LOLService myLOL = new Dealer(charName);

            LOLUser user = new LOLUser(myLOL);

            System.out.println(charName + "님 몬스터를 잡을까요? (1)YES (2)NO");
            int choice2 = scan.nextInt();
            if (choice2 == 1) {
                user.attack();
            }
            else {
                System.out.println("몬스터에 의해 죽었습니다.");
            }
        }

        else if(choice == 2) {
            System.out.println("원거리 딜러 캐릭터 이름 : ");
            String charName = scan.next();
            LOLService myLOL = new Dealer(charName);

            LOLUser user = new LOLUser(myLOL);

            System.out.println(charName + "님 몬스터를 잡을까요? (1)YES (2)NO");
            int choice2 = scan.nextInt();
            if (choice2 == 1) {
                user.attack();
            }
            else {
                System.out.println("몬스터에 의해 죽었습니다.");
            }
        }

        else {
            System.out.println("잘못 선택하셨습니다.");
        }

    }
}
