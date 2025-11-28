package com.mph.Maven27Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Integer arr[]= {23,12,34,33,55,46,57,67,32,134,809};
       //Terminal Operations
       Arrays.stream(arr).forEach(System.out::println);
       List<Integer> iList= Arrays.stream(arr).collect(Collectors.toList());
       System.out.println(iList);
       int min= Arrays.stream(arr).min((a,b)->a-b).get();
       System.out.println(min);
       min=Arrays.stream(arr).min(Integer::compare).get();
       long count=Arrays.stream(arr).count();
       System.out.println(count);
       
//       sum of array using reduce
       int sum=Arrays.stream(arr).reduce(0, (a,b)->a+b);
       System.out.println("Sum of Arrays elements : "+sum);
       System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b));
       
       //Intermediate Operations
       //1.filter
       System.out.println("--------------------Filter-------------------------");
       Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
       //2.Map
       System.out.println("--------------------Map-------------------------");
       Stream.of(arr).map(num->num+10).forEach(System.out::println);
       //3.limit
       System.out.println("--------------------Limit-------------------------");
       Stream.of(arr).limit(5).forEach(System.out::println);
       System.out.println("--------------------Skip-------------------------");
       Stream.of(arr).skip(5).forEach(System.out::println);
       System.out.println("--------------------Distinct-------------------------");
       Stream.of(arr).distinct().forEach(System.out::println);
       System.out.println("--------------------Distinct then count-------------------------");
       System.out.println(Arrays.stream(arr).distinct().count());
       System.out.println(Arrays.toString(arr));
       System.out.println("--------------------anyMatch-------------------------");
       System.out.println(Stream.of(arr).anyMatch(num->num>25));
       
       System.out.println("--------------------findFirst-------------------------");
       System.out.println(Stream.of(arr).filter(num->num>25).findFirst().get());
       System.out.println("---------------------------------------------");
       Integer[] nums= {23,12,45,56,25,78,65,78,90,33,56};
       List<Integer> numList=Arrays.asList(nums);
       numList.stream().filter(num->num%3==0)
       .distinct()
       .skip(2)
       .forEach(System.out::println);
       System.out.println("------------Sorted--------------------");
       numList.stream().sorted().forEach(System.out::println);
       
       System.out.println("------------Sorted Reverse--------------------");
       numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
       
       //stream of strings
       System.out.println("------------Stream of Things-------------------");
       String[] names= {"swapna","amit","swathi","pooja","vikky","raj","smit","vikram","spoorthi"};
       Arrays.stream(names)
       .filter(name->name.length()>=5)
       .filter(name->name.startsWith("s"))
       .sorted(Comparator.reverseOrder())
       .forEach(System.out::println);
       
       //streams of user defined object collection
       Employee emp1=new Employee(123,"swapna",70000,"trainer","training");
       Employee emp2=new Employee(122,"swathi",80000,"manager","Accounts");
       Employee emp3=new Employee(124,"keerthana",30000,"accountant","Accounts");
       Employee emp4=new Employee(125,"amit",85000,"manager","training");
       Employee emp5=new Employee(126,"bunny",50000,"salesrep","sales");
       System.out.println("------------streams of user defined object collection-------------------");
       ArrayList<Employee> eList= new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
       eList.stream().filter(emp->emp.getSalary()>50000).forEach(System.out::println);
       System.out.println("------------------------------------------------");
//       eList.stream().filter(emp->emp.getDesg().equals("manager"))
//       .sorted(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())
//       .map(e-)
//       .forEach(System.out::println);
    }
}
