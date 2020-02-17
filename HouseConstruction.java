package EPAM.ConstructionCost;

/**
 * Hello world!
 *
 */
interface HouseConstruction{
	double constructionCost(String materialStandard,double areaOftheHouse,boolean isFullyAutomated);
}
class ConstructionCostCalculator implements HouseConstruction{

	public double constructionCost(String materialStandard, double areaOftheHouse, boolean isFullyAutomated) {
		double totalCost = 0;
		switch(materialStandard) {
		case "Standard": 
			totalCost=1200;
			break;
		case "AboveStandard": 
			totalCost=1500;
			break;
		case "HighStandard": 
				if(isFullyAutomated) 
					totalCost=1800;
				else
					totalCost=2500;
				break;
				
	}
		return totalCost;
	
}
}