package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Town> towns = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("Sail")) {
            String[] data = line.split("\\|\\|");
            String name = data[0];
            int people = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            if (towns.containsKey(name)) {
                Town town = towns.get(name);
                town.setGold(town.getGold() + gold);
                town.setPeople(town.getPeople() + people);
            } else {
                Town town = new Town(name, people, gold);
                towns.put(name, town);
            }
            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("=>");
            String event = data[0];
            String name = data[1];

            Town town= towns.get(name);

            switch (event) {
                case "Plunder":
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);
                    town.setGold(town.getGold()-gold);
                    town.setPeople(town.getPeople()-people);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    if(town.getGold()==0||town.getPeople()==0){
                        System.out.printf("%s has been wiped off the map!\n", name);
                        towns.remove(name);
                    }
                    break;
                case "Prosper":
                    break;

            }
            line = scanner.nextLine();
        }
    }

    static class Town {
        String town;
        int people;
        int gold;

        public Town(String town, int people, int gold) {
            this.town = town;
            this.people = people;
            this.gold = gold;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public int getPeople() {
            return people;
        }

        public void setPeople(int people) {
            this.people = people;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }
}
