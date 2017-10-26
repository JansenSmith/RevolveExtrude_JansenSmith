double wheelRadius = 33.0
wheelHeight=17.6
double radius = 6.0
CSG profile = new RoundedCube(	wheelRadius,// X dimention
				radius,// Y dimention
				wheelHeight//  Z dimention
				)
				.cornerRadius(radius)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
				.toXMin()
				.toZMin()
//create a Cylinder
height = 22.5
CSG wheel_body = CSG.unionAll(
		Extrude.revolve(profile,(double)0,(int)10)
		)
		.movez(wheelHeight*1.5)

return [wheel_body,profile ]