double wheelRadius = 33.0
wheelHeight=17.6
double radius = 6.0
CSG profile = new RoundedCube(radius,// x dimention
					wheelRadius,// y dimention
				
				wheelHeight//  Z dimention
				)
				.cornerRadius(radius)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
				.toYMin()
				.toZMin()
				
//create a Cylinder
height = 22.5
CSG wheel_body = CSG.unionAll(
		Extrude.revolve(profile,
		(double)10, // rotation center radius, if 0 it is a circle, larger is a donut. Note it can be negative too
		(double)180,// degrees through wich it should sweep
		(int)10)//number of sweep increments
		)
		.movez(wheelHeight*1.5)

return [wheel_body,profile ]