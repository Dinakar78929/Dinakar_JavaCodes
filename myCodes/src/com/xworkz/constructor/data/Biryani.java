package com.xworkz.constructor.data;

public class Biryani {

	String name;
	int chicken;
	String rice;
	int calories;
	float carbohidrates;
	float cardemom;
	float clove;
	int chinnamon;
	int onion;
	int tomatoo;
	float chilli;
	float salt;
	int ginger;
	String garlik;
	int lemon;
public  Biryani() 
{
	
}
public  Biryani(String nm) 
{
	name=nm;
}
public Biryani(String nm,int ckn)
{
	name=nm;
	chicken=ckn;
}
public Biryani(String nm,int ckn,String rc)
{
	name=nm;
	chicken=ckn;
	rice=rc;
}
public Biryani(String nm,int ckn,String rc,int clrs)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin,int on)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
	onion=on;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin,int on,int tmt)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
	onion=on;
	tomatoo=tmt;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin,int on,int tmt,float chi)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
	onion=on;
	tomatoo=tmt;
	chilli=chi;
}
public  Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin,int on,int tmt,float chi,float slt)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
	onion=on;
	tomatoo=tmt;
	chilli=chi;
	salt=slt;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin,int on,int tmt,float chi,float slt,int ggr)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
	onion=on;
	tomatoo=tmt;
	chilli=chi;
	salt=slt;
	ginger=ggr;
}

public  Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin,int on,int tmt,float chi,float slt,int ggr,String grk)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
	onion=on;
	tomatoo=tmt;
	chilli=chi;
	salt=slt;
	ginger=ggr;
	garlik=grk;
}
public Biryani(String nm,int ckn,String rc,int clrs,float crb,float crdm,float clv,int chin,int on,int tmt,float chi,float slt,int ggr,String grk,int lmn)
{
	name=nm;
	chicken=ckn;
	rice=rc;
	calories=clrs;
	carbohidrates=crb;
	cardemom=crdm;
	clove=clv;
	chinnamon=chin;
	onion=on;
	tomatoo=tmt;
	chilli=chi;
	salt=slt;
	ginger=ggr;
	garlik=grk;
	lemon=lmn;
}
public  void  show() 
{
	System.out.println("---------Biriyani details start-------------- ");
	System.out.println("Briyani name is:"+name);
	System.out.println("Number of chicken piece:"+chicken);
	System.out.println("rice:"+rice);
	System.out.println("calories:"+calories);
	System.out.println("carbohidrates value:"+carbohidrates);
	System.out.println("cardemom in grams:"+cardemom);
	System.out.println("clove in grams :"+clove);
	System.out.println(" number of chinnamom: "+chinnamon);
	System.out.println(" number of onion:"+onion);
	System.out.println("number of tomatoo: "+tomatoo);
	System.out.println(" chilli powder in grms:"+chilli);
	System.out.println("Salt in grms: "+salt);
	System.out.println("number of ginger: "+ginger);
	System.out.println("number of garlik: "+garlik);
	System.out.println("number of lemon: "+lemon);
	System.out.println("---------Biriyani details end-------------- ");
	
	
}
}








