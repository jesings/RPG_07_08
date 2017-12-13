public class UserOfRPGv2{    
    public static void main(String[] args){
	// Character[] agents = new Character[8];
	//Prediction 1:
	//This will fail when it calls the Protagonist-class instances,
	//as they are not from the same superclass.
	//It will scream the line they are on and say they are invalid references.
	//Prediction 2:
	//This will fail when it tries to call the method getName() from each Monster instance
	//as they do not have such method
	//It will say that it is illegal or that it could not find .getName() in Monster
	 Monster[] agents = new Monster[8];
	// agents[0] = new Protagonist("guy");
	// agents[1] = new DarkMage("guy");
	// agents[2] = new GreyMage("guy");
	// agents[3] = new LightMage("guy");
	agents[4] = new Monster();
	agents[5] = new Skeleton();
	agents[6] = new Wisp();
	agents[7] = new Wraith();
	for(Character a:agents){
	    System.out.println(a);
	}
	for(Monster a:agents){
	    System.out.println(a.getName());
	}
    }
}
//Error for Prediction 1:
//UserOfRPGv2.java:9: error: incompatible types: DarkMage cannot be converted to Monster
//         agents[1] = new DarkMage("guy");
//                     ^
// UserOfRPGv2.java:10: error: incompatible types: GreyMage cannot be converted to Monster
//         agents[2] = new GreyMage("guy");
//                     ^
// UserOfRPGv2.java:11: error: incompatible types: LightMage cannot be converted to Monster
//         agents[3] = new LightMage("guy");
//                     ^
// 3 errors

//Error for Prediciton 2:
// UserOfRPGv2.java:25: error: cannot find symbol
//             System.out.println(a.getName());
//                                 ^
//   symbol:   method getName()
//   location: variable a of type Monster
// 1 error
