// ���� 4-3 
// �� ���� �����ڸ� ���� Circle Ŭ����
// ���� �ڵ�� 2���� �����ڸ� ���� Circle Ŭ�����̴�. ���� ����� �����ΰ�?

public class ex_4_3
{
	int radius;
	String name;

	// �Ű� ���� ���� ������
	// ������ �̸� = Ŭ���� �̸��� ����
	public Circle()
	{
		// radius�� �ʱⰪ = 1
		radius = 1;
		name = "";
	}

	// �Ű� ������ ���� ������
	// �����ڴ� ���� Ÿ�� ����
	public Circle(int r, String n)
	{
		radius = r;
		name = n;
	}
	public double getArea()
	{
		return 3.14 * radius * radius;
	}

	public static void main(String[] args)
	{
		// Circle ��ü ����
		// ������ = 10
		Circle pizza = new Circle(10, "�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);

		Circle donut = new Circle();
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}