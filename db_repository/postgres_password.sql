select * from information_schema.tables;
/
select * from information_schema.tables where table_schema = 'information_schema';
/
select * from information_schema.tables where table_schema = 'public'; -- To show all the table list
/
select * from information_schema.columns where table_name = 'address'; -- desc table
/
select * from address;
/
select customer0_.id as id0_1_, customer0_.age as age0_1_, customer0_.name as name0_1_, address1_.Customer_id as Customer1_0_3_, address2_.addressId as address2_3_, address2_.addressId as addressId2_0_, address2_.Line1 as Line2_2_0_, address2_.addressType as addressT3_2_0_, address2_.city as city2_0_, address2_.country as country2_0_, address2_.landmark as landmark2_0_, address2_.lattitude as lattitude2_0_, address2_.line2 as line8_2_0_, address2_.line3 as line9_2_0_, address2_.longitude as longitude2_0_, address2_.pin as pin2_0_, address2_.state as state2_0_ from Customer customer0_ left outer join Customer_Address address1_ on customer0_.id=address1_.Customer_id left outer join Address address2_ on address1_.address_addressId=address2_.addressId where customer0_.id=101;