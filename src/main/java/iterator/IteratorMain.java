package iterator;

import businessLogic.BLFacade;
import businessLogic.BLFacadeFactory;

public class IteratorMain {

    public static void main(String[] args) {

        try {
            BLFacade blFacade = BLFacadeFactory.createBLFacade();

            ExtendedIterator<String> i =blFacade.getDepartingCitiesIterator();

            String c;
            System.out.println("_____________________");
            System.out.println("FROM LAST TO FIRST");
            i.goLast();
            while (i.hasPrevious()) {
                c = i.previous();
                System.out.println(c);
            }

            System.out.println();
            System.out.println("_____________________");
            System.out.println("FROM FIRST TO LAST");

            i.goFirst();

            while (i.hasNext()) {
                c = i.next();
                System.out.println(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}