package Tareas;

public class Tarea1 {

	public static void main(String[] args) {
		//Determinar la longitud de una cadena
		String s = "Hola";
		int x = s.length(); // retorna 4
		System.out.println(x);
		
		//Determinar si una cadena es la cadena vacia
		String s1 = "Hola";
		boolean b1 = s1.isEmpty(); //false
		System.out.println(b1);
		String s2 = "";
		boolean b2 = s2.isEmpty(); //true 
		System.out.println(b2);
		
		//Acceder a los caracteres de una cadena
		String t = "Hola";
		for (int i=0; i<t.length(); i++)
		{
			char c = t.charAt(i);
			System.out.print(c);
		}
		
		//Comparar cadenas
		String x1 = "Hola";
		String y1 = "Hola";
		if (x1.equals(y1))//Compara sus contenidos, returna true
		{
			System.out.println("SI pasa por aqui !");
		}
		
		//Determinar la posicion que ocupa un caracter dentro de una cadena
		String a = "Hola, como estas?";
		int a1 = a.indexOf('a');//Retorna 3
		System.out.println(a1);
		int a2 = a.lastIndexOf('a');//Retorna 14
		System.out.println(a2);
		
		//Determinar la posicion que ocupa una subcadena dentro de una cadena
		String d = "Hola, como estas? Estas como querias?";
		int d1 = d.indexOf("como");//Retorna 6
		System.out.println(d1);
		int d2 = d.indexOf("estas");//Retorna 11
		System.out.println(d2);
		int d3 = d.lastIndexOf("como");//Retorna 24
		System.out.println(d3);
		
		//Convertir a mayusculas y minusculas
		String e = "Hola, como estas?";
		String may = e.toUpperCase(); //Mayusculas
		System.out.println(may);
		String min = e.toLowerCase(); //Minusculas
		System.out.println(min);
		
		//Subcadenas
		String f = "Hola, como estas?";
		String f1 = f.substring(0,4);//Hola
		System.out.println(f1);
		String f2 = f.substring(6,10);//como
		System.out.println(f2);
		String f3 = f.substring(11);//estas?
		System.out.println(f3);
		
		//Enteros
		String g1 = "1234";
		int h = Integer.parseInt(g1); //1234
		System.out.println(h);
		String j1 = Integer.toString(h); //"1234"
		System.out.println(j1);
		//Flotantes
		String g2 = "1234.56";
		double h1 = Double.parseDouble(g2); //1234.56
		System.out.println(h1);
		String j2 = Double.toString(h1); //"1234.56"
		System.out.println(j2);
		
		//Concatenar cadenas
		String k = "Hola, ?";
		String k1 = "como estas?";
		String k2 = k+k1;//"Hola, como estas?"
		System.out.println(k2);
		
		//Clase String
		String l = "Hola";
		l = "chau";
		System.out.println(l);
		
		//String
		String m = "Hola";
		m+= ", chau";
		System.out.println(m);
		
		//Concatenar
		StringBuilder n = new StringBuilder();
		n.append("Hola, ");
		n.append("chau");
		System.out.println(n);
		
		//Modificar los caracteres de una columna
		StringBuilder o = new StringBuilder("Hola");
		o.setCharAt(2, 'X');
		System.out.println(o);
		
		//Ejemplo
		StringBuilder p = new StringBuilder("Alesander");
		p.setCharAt(3, 'x');
		System.out.println(p);
		
		//Segundo ejemplo
		StringBuilder q = new StringBuilder();
		q.append("Alexander ");
		q.append("Tovar");
		System.out.println(q);
}
}