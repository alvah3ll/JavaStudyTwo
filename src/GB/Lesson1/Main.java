package GB.Lesson1;

public class Main {

    public static void main(String[] args) {
        RunAndJump[] participants = {
                new Human(3,7,"Nico"),
                new Human(2,10,"Sara"),
                new Cat(4,4,"Mimi"),
                new Cat(3,3,"Pit"),
                new Robot(15,7,"RT-90"),
                new Robot(19,8,"MP-20")
        };
        Obstacles[] let={
                new Treadmill(1),
                new Treadmill(9),
                new Wall(1),
                new Wall(5)
        };
        for (RunAndJump participant : participants){
            System.out.println(participant);
            boolean winner = true;
            for (Obstacles lets: let){
                System.out.println("Начинает проходить препядствие: "+"\n"+lets);
                if (lets.toJump(participant.getMaxHeight())||
                        lets.toRun(participant.getMaxLength())){
                    System.out.println("Участнику удается преодолеть!");
                }else {
                    winner = false;
                    System.out.println("Участнику не удается преодолеть!");
                }
            }
            if(winner){
                System.out.println(participants+" выиграл!");
            }else {
                System.out.println(participants+"проиграл.");
            }
            System.out.println();

        }
    }
    }

