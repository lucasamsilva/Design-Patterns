import builder.GameBuilderImpl;
import minion.FastGameMinion;
import minion.NormalGameMinion;
import nexus.FastGameNexus;
import nexus.NormalGameNexus;
import tower.FastGameTower;
import tower.NormalGameTower;

public class BuilderApplication {

    public static void main(String[] args) {
        var normalGameNexus = new NormalGameNexus();
        var normalGameTowers = new NormalGameTower();
        var normalGameMinions = new NormalGameMinion();

        var fastGameNexus = new FastGameNexus();
        var fastGameTowers = new FastGameTower();
        var fastGameMinions = new FastGameMinion();

        var normalGame = new GameBuilderImpl()
                .nexus(normalGameNexus)
                .towers(normalGameTowers)
                .minions(normalGameMinions)
                .build();

        var fastGame = new GameBuilderImpl()
                .nexus(fastGameNexus)
                .towers(fastGameTowers)
                .minions(fastGameMinions)
                .build();

        var mixedGame = new GameBuilderImpl()
                .nexus(normalGameNexus)
                .towers(normalGameTowers)
                .minions(fastGameMinions)
                .build();

        System.out.println("Starting Normal Game");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + normalGame.getMinions().getMoveSpeed());
        System.out.println("Damage: " + normalGame.getMinions().getDamage());
        System.out.println("Life Points: " + normalGame.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + normalGame.getTowers().getDamage());
        System.out.println("Life Points: " + normalGame.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + normalGame.getNexus().getLifePoints());

        System.out.println("-------------------------------------------------");

        System.out.println("Starting Fast Game");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + fastGame.getMinions().getMoveSpeed());
        System.out.println("Damage: " + fastGame.getMinions().getDamage());
        System.out.println("Life Points: " + fastGame.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + fastGame.getTowers().getDamage());
        System.out.println("Life Points: " + fastGame.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + fastGame.getNexus().getLifePoints());

        System.out.println("-------------------------------------------------");

        System.out.println("Starting Mixed Game");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + mixedGame.getMinions().getMoveSpeed());
        System.out.println("Damage: " + mixedGame.getMinions().getDamage());
        System.out.println("Life Points: " + mixedGame.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + mixedGame.getTowers().getDamage());
        System.out.println("Life Points: " + mixedGame.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + mixedGame.getNexus().getLifePoints());
    }

}
