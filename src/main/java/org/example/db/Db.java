package org.example.db;

import org.example.dto.MexmonxonaDto;
import org.example.enums.EmployeeType;
import org.example.enums.RoomType;
import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Db {
    public static List<User>userList=new ArrayList<>();
    public static List<Employeee>employeeeList=new ArrayList<>();
    public static List<Room>roomList=new ArrayList<>();
    public static List<Mexmonxona>mexmonxonaList=new ArrayList<>();
    public static List<Product>productList=new ArrayList<>();
    public static List<RoomType>roomTypeList=new ArrayList<>();
    public static List<RoomType>roomRest=new ArrayList<>();
    public static List<MexmonxonaDto>mexmonxonaDtoList=new ArrayList<>();
    public static List<Derictor>derictors=new ArrayList<>();
    //1-comment
    List<String>strings=new ArrayList<>();
    //2-commit
    List<Integer>integerList=new ArrayList<>();
    //3-commit
    List<Double>doubleList=new ArrayList<>();
    public static void run(){
        mexmonxonaList.add(new Mexmonxona(1,"SardorHotel","+998553087575"));
        userList.add(new User(1,"Sardor Yusufjonov",10000,"+998908096164","1111",false));
        userList.add(new User(2,"Ibrohim",20000,"+998908096264","0000",false));

        productList.add(new Product(new Random().nextInt(100),"Osh",25));
        productList.add(new Product(new Random().nextInt(100),"Qozon kabob",35));
        productList.add(new Product(new Random().nextInt(100),"Qourma Lagmon",20));
        productList.add(new Product(new Random().nextInt(100),"CocaCola",5));
        productList.add(new Product(new Random().nextInt(100),"Perojni",12));

        roomList.add(new Room(new Random().nextInt(100),"name",1,1300, RoomType.LUCS,false));
        roomList.add(new Room(new Random().nextInt(100),"name",1,3000, RoomType.BIZNES,false));
        roomList.add(new Room(new Random().nextInt(100),"name",1,1000, RoomType.LUCS,false));
        roomList.add(new Room(new Random().nextInt(100),"name",1,500, RoomType.ODDIY,false));
        roomList.add(new Room(new Random().nextInt(100),"name",1,800, RoomType.STANDART,false));
        roomList.add(new Room(new Random().nextInt(100),"name",1,1300, RoomType.LUCS,false));
        roomList.add(new Room(new Random().nextInt(100),"name",1,1300, RoomType.LUCS,false));

        roomTypeList.add(RoomType.BIZNES);
        roomTypeList.add(RoomType.LUCS);
        roomTypeList.add(RoomType.ODDIY);
        roomTypeList.add(RoomType.STANDART);

        roomRest.add(RoomType.RESTORAN);

        employeeeList.add(new Employeee(new Random().nextInt(100), EmployeeType.ADMIN,1,"7777"));
        employeeeList.add(new Employeee(new Random().nextInt(100), EmployeeType.DERICTOR,2,"0000"));


    }

}
