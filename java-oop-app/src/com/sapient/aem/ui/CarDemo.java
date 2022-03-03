package com.sapient.aem.ui;

import com.sapient.aem.service.Car;
import com.sapient.aem.service.Engine;
import com.sapient.aem.service.Tyre;

//Aggregation
public class CarDemo {

	public static void main(String[] args) {
		Car myCar= new Car("Swift Dezire",new Engine(2345678L,"petrol",3000),
				
				new Tyre[] {new Tyre("MRF",22),new Tyre("MRF",22),
						new Tyre("MRF",22),new Tyre("MRF",22)});
		
		System.out.println(myCar);
		
		//Before GCing Car object, we want extract the engine and one rear tyre
		
		Engine oldEngine= myCar.getEngine();
		System.out.println(oldEngine);
		Tyre oldTyre= myCar.getTyres()[2];	
		System.out.println(oldTyre);
		myCar=null;
		System.out.println(myCar);

	}

}
