package java8feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample
{
	public static void main(String[] args)
	{
		List<Product> list = new ArrayList<Product>();

		//traditional way
		for(Product product : getList()){
			if(product.getPrice() > 2000){
				list.add(product);
			}
		}

		//sorting using stream
		List<Product> ls  = list.stream().sorted(new Comparator<Product>()
		{
			@Override
			public int compare(Product o1, Product o2)
			{
				return (int) (o1.getPrice()-o2.getPrice());
			}
		}).collect(Collectors.toList());

		for (Product product: ls){
			System.out.println(product);
		}

		System.out.println("***********************************************");
		//using stream filer
		List<Product> list2 = getList().stream().filter((product -> product.getPrice() > 2000)).collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println("***********************************************");
		//orelse
		getList().stream().filter((product -> product.getPrice() > 2000)).forEach(System.out::println);
	}

	public static List<Product> getList(){
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1l,"mango",3000f));
		list.add(new Product(2l,"apple",2500f));
		list.add(new Product(3l,"orange",2000f));
		list.add(new Product(4l,"papaya",4000f));
		return list;
	}
}

class Product{
	public Long id;
	public String name;
	public float price;

	public Product(Long id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
	}
}
