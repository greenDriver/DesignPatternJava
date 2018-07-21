package composite;
/**
 * ���ڱ�ʾ��ι�ϵ������/���ֿ�������ͬ�ṹ ���ļ��У���
 * @author qzhen
 *
 */
public class Folder extends Component{

	public Component[] files;
	
	public String folderName;
	
	public Folder(Component[] source){
		this.files=source;
	}
	
	public void scan(){
		for(Component com:files){
			if(com instanceof File){
				System.out.println(" component type: "+",file "+"fileName: "+((File)com).fileName);
			}else if(com instanceof Folder){
				System.out.println("component type:"+",folder"+"folderName: "+((Folder)com).folderName);
				((Folder) com).scan();
			}
		}
	}
}
