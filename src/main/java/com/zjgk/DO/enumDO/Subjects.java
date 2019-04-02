package com.zjgk.DO.enumDO;

public enum Subjects {
	语文 ,
	英语,
	数学,
	物理,
	化学,
	生物,
	政治,
	历史,
	地理,
	技术;
	
	public static Subjects getSubject(int value){
		switch(value){
		case 0:return Subjects.语文;
		case 1:return Subjects.英语;
		case 2:return Subjects.数学;
		case 3:return Subjects.物理;
		case 4:return Subjects.化学;
		case 5:return Subjects.生物;
		case 6:return Subjects.政治;
		case 7:return Subjects.历史;
		case 8:return Subjects.地理;
		case 9:return Subjects.技术;
		default:return null;
		}
	}
}
