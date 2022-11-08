/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 11/08/2022
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Kaan Sen________
*/

import java.util.Arrays;

public class ManagementCompany {

	static final int MAX_PROPERTY = 5;
	static final int MGMT_WIDTH = 10;
	static final int MGMT_DEPTH = 10;
	
	private String name;
	private String taxID;
	private double mgmFee;
	private Property[] properties;
	private Plot plot;
	private int numberOfProperties;
	
	
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0.0;
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.properties = new Property[MAX_PROPERTY];
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.plot = new Plot(otherCompany.plot);
	}
	
	
	public int addProperty(String name, String city, double rent, String owner)
	{
		return addProperty(new Property(name, city, rent, owner));
				
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	}
	
	public int addProperty(Property p)
	{
		if(p == null)
		{
			return -2;
		}
		if(!plot.encompasses(p.getPlot()))
		{
			return -3;
		}
		
		for(int i = 0; i<properties.length; i++)
		{
			if(properties[i] != null)
			{
				if(properties[i].getPlot().overlaps(p.getPlot()))
				{
					return -4;
				}
			}
			else
			{
				properties[i] = p;
				return i;
			}
		}
		return -1;
	}
	
	public void removeLastProperty()
	{
		Property[] newProperties = Arrays.copyOf(properties, properties.length -1);
	}
	
	public boolean isPropertiesFull()
	{

		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				return false; 
			}
		}
		return true;
	}
	
	public int getPropertiesCount()
	{
		int count = 0; 
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] != null)
			{
				count++; 
			}
		}
		return count;
	}
	
	public double getTotalRent()
	{
		double totalRent = 0.0;
		
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] != null)
			{
				totalRent += properties[i].getRentAmount();
			}
		}
		return totalRent;
	}
	
	public Property getHighestRentPropperty()
	{	
		return properties[getHighestRentProppertyIndex()];
	} 
	
	public int getHighestRentProppertyIndex()
	{
		int indexMaxRent=0;
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] != null)
			{
				if(properties[indexMaxRent].getRentAmount() < properties[i].getRentAmount())
				{
					indexMaxRent = i;
				}
			}
		}
		return indexMaxRent;
	}
	
	public boolean isManagementFeeValid()
	{
		if(mgmFee >= 0 && mgmFee <= 100)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		String message = "";
		
		for(int i = 0; i < MAX_PROPERTY; i++) 
		{
			if(properties[i] != null)
			{
				message = message + properties[i].getPropertyName() + "," + properties[i].getCity() + "," + properties[i].getOwner() + "," + properties[i].getRentAmount() + "\n";
			}
		}
			return "List of the properties for " + name + ", taxID: " + taxID 
					+ "\n______________________________________________________\n" 
					+ message 
					+ "\n" + "______________________________________________________\n "
					+ "total management Fee: " + getTotalRent()*(mgmFee/100);
		}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public double getMgmFee() {
		return mgmFee;
	}

	public void setMgmFee(double mgmFee) {
		this.mgmFee = mgmFee;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	public Plot getPlot() {
		return this.plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public int getNumberOfProperties() {
		return numberOfProperties;
	}

	public void setNumberOfProperties(int numberOfProperties) {
		this.numberOfProperties = numberOfProperties;
	}
		
}
