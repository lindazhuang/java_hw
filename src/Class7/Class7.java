package Class7;

/**
 * <pre>
 * �A�ת���ɦV�ǲ�
 *
 * ����ɦV����شN�O
 * ��X�X��ƪ����P������
 * �ç�����ưȡA���ɨ������W��@��
 * �j�a�����ӵ۰򥻳W�d��
 * �|�j�T��֤����n�����е{���X
 *
 * Extends(�~��)
 * �~�ӴN�O�A�������Ҧ��@���A���ަn�a
 *
 * Encapsulation(�ʸ�)
 * �N���\�U�I��@�ˡA�W�ӴN�O�@�D�Ʋz
 * �@��ȤH�N�|ı�o�i�H�Y�N�n�F
 * ���|�h�L���F�ѫ��ԲӮƲz��
 * �Ʋz���O�A�N�浹���a�B�z!
 * �t�d�Y�N��F
 *
 * Polymorphism(�h��)
 * �N��j���N�O
 * �@�ɳo��j�A�����ܦh
 * �j�a�Ʋz�覡�N�|�t��
 * �N�|���h�˩ʥX�{�F
 * �N�|���U�a������
 * �Y�Y�Y!!
 *
 * </pre>
 */
public class Class7 {
  public static void main(String[] args) {
	// �׹��l
//	Modifier modifier = new Modifier();
//	modifier.iAmPublic = "iAmPublic";
//	modifier.iAmProtected = "iAmProtected";
//	modifier.iAmNotModifier = "iAmNotModifier";
//	System.out.println("iAmPublic = " + modifier.iAmPublic);
//	System.out.println("iAmProtected = " + modifier.iAmProtected);
//	System.out.println("iAmNotModifier = " + modifier.iAmNotModifier);
    
	// �~��
	ONE_PIECE ONE_PIECE = new �|��();
	System.out.println("ONE_PIECE.�j���_ = " + ONE_PIECE.�j���_);
	�|�� �|�� = null;
	// Java �� instanceof �B��l (instanceof operator)
	// ���լY�@����O�_���t�@���O (class) ���l���O (subclass)
	if(ONE_PIECE instanceof �|��){
  	�|�� = (�|��) ONE_PIECE;
	}
	System.out.println("�|��.�j���_ = " + �|��.�j���_);
	�|��.serach();
    
	// �~�ӡA��H�A�h���A�ʸ�
	Food cake = new Cake();
	cake.setName("�����J�|");
	cake.setRaw("�ѯ��A���o�A�A���A�����A�ͩվ��A�N�c");
	cake.cooking();
	Food tea = new Tea();
	tea.setName("����");
	tea.setRaw("�x���Q�K��");
	tea.cooking();
	// Overloading �h��
	
	actor role1 = new Role1();
	role1.setBlood("200");
	role1.setLv("10");
	role1.attack();
	role1.getBlood();
	role1.getLv();
	role1.acting();
	
	new Overloading().exec();
  }
}

/**
 * <pre>
 *  abstract�׹��l�A��b���O���e�A�N������H���O
 *  �ڭ̵L�k�����ϥΩ�H�������ͪ���ӨϥΡA
 *  �����n���H�~�ӥL�����
 * </pre>
 */
abstract class ONE_PIECE {
  // �غc�l�u������
  public ONE_PIECE(){
	System.out.println("�G�ƶ}�l�F!!");//1
  }
  public String �j���_ = "???";//3
}

class �|�� extends ONE_PIECE{
  //�غc�l�u������
  public �|��(){
	System.out.println("��!!!!!!!");//2
  }
  public void serach(){
	System.out.println("���Фj�j�A�٨S�e��...");//4
  }
}

/**
 * <pre>
 * Interface(����)
 * �L���s�b�N�O�A�ڥu�i������
 * �ӶǤJ�����ƻP���Ӧ^�Ǫ��Ʋz
 * �ܩ�Ʋz�覡�A���j�a��@��
 * �ۦ�o��~
 * </pre>
 */
interface FoodAction{
  public void setRaw(String raw);
  public String getRaw();
  public void cooking();
}

// ��H���O �J�|�A�~�ӤF�����A��@�F�Ʋz�L�{
// ������ݭn�⹳���O����]�O
// �����O�@�Ӥj�����O�A�i�H�γo�Ӥ覡
// �w�q�X�j�a�ۦP�������A�ѤU���Q�n�~�Ӫ����O
// �ۤv���X�Q�n���F��Y�i
abstract class Food implements FoodAction{
  protected String raw;
  private String name;
  // �ʸ�name(�W�r)�ت��O�A���i�H���~���H�N���W�r
  // �H�K�Q�������~�Хܤ��W
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
 
}
class Cake extends Food {

  @Override

  public void setRaw(String raw) {
	this.raw = raw;
  }

  @Override
  public String getRaw() {
	return raw;
  }

  @Override
  public void cooking() {
	System.out.println("�{�b�n�����Ʋz�O : " + getName());
	System.out.println("���� : " + getRaw());
	System.out.println("Step 1 : �J��+�}���ܿ}��");
	System.out.println("Step 2 : �[�J�F�Ԫo �դ�");
	System.out.println("Step 3 : �[�J�G��&������� ");
	System.out.println("Step 4 : �����V�X�L�z�[�J");
	System.out.println("etc...");
  }

}

// ���O ���A�~�ӤF�����A��@�F�Ʋz�L�{
class Tea extends Food {

  @Override
  public void setRaw(String raw) {
	this.raw = raw;
  }

  @Override
  public String getRaw() {
	return raw;
  }

  @Override
  public void cooking() {
	System.out.println("�{�b�n�����Ʋz�O : " + getName());
	System.out.println("���� : " + getRaw());
	System.out.println("Step 1 : ����");
	System.out.println("Step 2 : �����S�L������A�˱�");
	System.out.println("Step 3 : ��J����");
	System.out.println("Step 4 : �[�J�����A²��L�R��˱�");
	System.out.println("Step 5 : �A���[�J�����A�̷ӿ@�׵���1~3������A�Y�i");
  }
 
}

/**
 * <pre>
 * Overloading
 * �h�����γ~�O
 * ��k�W�٫O���@�P
 * ���O�������ѼƤ��P�Ӥw
 * �̱`�ϥΨ쪺�N�O
 * System.out ����
 * </pre>
 */
class Overloading{
  public void exec(){
	sleep(1000);
	sleep(2000.0f);
  }
 
  private void sleep(int time){
	System.out.println("�Φh�[ = " + time + "s");
  }
 
  private void sleep(float time){
	System.out.println("�Φh�[ = " + time  + "s");
  }
}


// �m��
// �C�������\�h"����"
// ���⦳��q�A����
// ���⦳�T��¾�~
// �Ԥh�B�]�k�v�B�}�b��(���O)
// �C�ӤH���|"�򥻧���" �H��"�S��ޯ�"(interface)
// �]�p�X�������O�P����
// �åB�����ڥ��~�ӡA��H�A�h���A�ʸˤ覡�]�p

interface role{
	  public void attack();
	  public void spattack();
	}
abstract class actor implements role{
	private String blood;
	  private String lv;
	  // �ʸ�name(�W�r)�ت��O�A���i�H���~���H�N���W�r
	  // �H�K�Q�������~�Хܤ��W
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getLv() {
		return lv;
	}
	public void setLv(String lv) {
		this.lv = lv;
	}
	}

class Role1 extends actor {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���M");
	}

	@Override
	public void spattack() {
		// TODO Auto-generated method stub
		System.out.println("�g�M");
	}
	public void acting() {
		System.out.println("�Ԥh");
		System.out.println("��q : " + getBlood());
		System.out.println("���� : " + getLv());
	  }
}

class Role2 extends actor {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���");
	}

	@Override
	public void spattack() {
		// TODO Auto-generated method stub
		System.out.println("�e���I�S");
	}
}

class Role3 extends actor {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�u�g");
	}

	@Override
	public void spattack() {
		// TODO Auto-generated method stub
		System.out.println("���g");
	}
}