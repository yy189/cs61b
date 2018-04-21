public class Planet {
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;
	public static final double G = 6.67e-11;

	public Planet(double xP, double yP, double xV,
		double yV, double m, String img) {
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;
	}

	public Planet(Planet p) {
		xxPos = p.xxPos;
		yyPos = p.yyPos;
		xxVel = p.xxVel;
		yyVel = p.yyVel;
		mass = p.mass;
		imgFileName = p.imgFileName;
	}

	public double calcDistance(Planet p) {
		return Math.sqrt((xxPos - p.xxPos) * (xxPos - p.xxPos) + (yyPos - p.yyPos) * (yyPos - p.yyPos));
	}

	public double calcForceExertedBy(Planet p) {
		double r = calcDistance(p);
		return G * mass  * p.mass / (r * r);
	}

	public double calcForceExertedByX(Planet p) {
		return (p.xxPos - xxPos) / calcDistance(p) * calcForceExertedBy(p);
	}

	public double calcForceExertedByY(Planet p) {
		return (p.yyPos - yyPos) / calcDistance(p) * calcForceExertedBy(p);
	}

	public double calcNetForceExertedByX(Planet[] allPlanets) {
		double sum = 0;
		for (Planet p : allPlanets) {
			if (this.equals(p)) {
				continue;
			}
			sum += calcForceExertedByX(p);
		}
		return sum;
	}

	public double calcNetForceExertedByY(Planet[] allPlanets) {
		double sum = 0;
		for (Planet p : allPlanets) {
			if (this.equals(p)) {
				continue;
			}
			sum += calcForceExertedByY(p);
		}
		return sum;
	}

	public void update(double dt, double fX, double fY) {
		xxVel = xxVel + dt * fX / mass;
		yyVel = yyVel + dt * fY / mass;
		xxPos = xxPos + dt * xxVel;
		yyPos = yyPos + dt * yyVel;
	}

	public void draw() {
		StdDraw.picture(xxPos, yyPos, "images/" + imgFileName);
	}
}