package ch07_1_inheritance;

public class DmbCellPhoneExample {
public static void main(String[] args) {
	//DmbCellPhone ��ü ����
	DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
	
	//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
	System.out.println("��: " + dmbCellPhone.model);
	System.out.println("����: " + dmbCellPhone.color);
	
	//DmbCellPhone Ŭ���� �ʵ�
	System.out.println("ä��: " + dmbCellPhone.channel);
	
	//Cellphone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
	
	dmbCellPhone.powerOn();
	dmbCellPhone.bell();
	dmbCellPhone.sendVoice("��������.");
	dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
	dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
	dmbCellPhone.hangup();
	
	//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
	
	dmbCellPhone.turnOnDmb();
	dmbCellPhone.changeChannelDmb(12);
	dmbCellPhone.turnOffDmb();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
	
}
