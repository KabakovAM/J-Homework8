package Homework8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FamilyTree implements FamilyTreeInterface {
    private String lastName;
    private String firstName;
    private String secondName;
    private String birthday;
    private String sex;
    private String personalId;
    private String fatherId;
    private String motherId;

    public FamilyTree(String lastName, String firstName, String secondName, String birthday, String sex,
    String personalId,
            String fatherId, String motherId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.sex = sex;
        this.personalId = personalId;
        this.fatherId = fatherId;
        this.motherId = motherId;
    }

    @Override
    public FamilyTree addToList(ArrayList<FamilyTree> family) {
        family.add(this);
        return this;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + secondName + ", " + birthday;
    }

    @Override
    public String getPersonalId() {
        return personalId;
    }

    @Override
    public String getFatherId() {
        return fatherId;
    }

    @Override
    public String getMotherId() {
        return motherId;
    }

    @Override
    public String getSexId() {
        return sex;
    }

    @Override
    public void printAll(ArrayList<FamilyTree> familyList) {
        for (FamilyTree person : familyList) {
            System.out.println(person);
        }
    }

    @Override
    public void printParent(ArrayList<FamilyTree> familyList) {
        for (FamilyTree person : familyList) {
            if (person.getPersonalId() == fatherId) {
                System.out.println("Отец:");
                System.out.println(person);
            } else if (person.getPersonalId() == motherId) {
                System.out.println("Мать:");
                System.out.println(person);
            }
        }
    }

    @Override
    public void printBrotherSister(ArrayList<FamilyTree> familyList) {
        for (FamilyTree person : familyList) {
            if (person.getFatherId() == fatherId && person.getPersonalId() != personalId) {
                if (person.getSexId() == "м") {
                    System.out.println("Брат:");
                    System.out.println(person);
                } else {
                    System.out.println("Сестра:");
                    System.out.println(person);
                }
            }
        }
    }

    @Override
    public void printChildrens(ArrayList<FamilyTree> familyList) {
        for (FamilyTree person : familyList) {
            if (person.getFatherId() == personalId) {
                if (person.getSexId() == "м") {
                    System.out.println("Сын:");
                    System.out.println(person);
                } else {
                    System.out.println("Дочь:");
                    System.out.println(person);
                }
            }
        }
    }

    @Override
    public void printGrandParent(ArrayList<FamilyTree> familyList) {
        for (FamilyTree person : familyList) {
            if (person.getPersonalId() == fatherId || person.getPersonalId() == motherId) {
                for (FamilyTree person2 : familyList) {
                    if (person.getFatherId() == person2.getPersonalId()) {
                        System.out.println("Дедушка:");
                        System.out.println(person2);
                    } else if (person.getMotherId() == person2.getPersonalId()) {
                        System.out.println("Бабушка:");
                        System.out.println(person2);
                    }
                }
            }
        }
    }

    @Override
    public void familyTreeToFile(ArrayList<FamilyTree> familyList) {
        try (FileWriter writer = new FileWriter("tree.txt", true)) {
            for (FamilyTree person : familyList) {
                writer.write(person.toString() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
