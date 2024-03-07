package basetest;

import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;

import java.util.List;

public class Utils extends Base_page {


    public String getPositionInList(FluentList<FluentWebElement> elementList, String searchString) {
        System.out.println(elementList);
        for (int i = 0; i < elementList.size(); i++) {
            FluentWebElement element = elementList.get(i);

            if (element.text().contains(searchString)) {
                System.out.println(i);
                return java.lang.String.valueOf(i);
            }
        }
        return String.valueOf(-1);
    }


    public String getPositionInList2(FluentList<FluentWebElement> elementList, String searchString) {
        System.out.println("elementList: " + elementList);
        for (int i = 0; i < elementList.size(); i++) {
            FluentWebElement element = elementList.get(i);
            System.out.println(element.text());
            if (element.text().contains(searchString)) {
                System.out.println(i);
                return java.lang.String.valueOf(i + 1);
            }
        }

        return String.valueOf(-1);

    }

    public void printPatientList(FluentList<FluentWebElement> elementList) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("elementList: " + elementList);
        for (int i = 0; i < elementList.size(); i++) {
            FluentWebElement element = elementList.get(i);
            System.out.println(element.text());


        }


    }


    }

