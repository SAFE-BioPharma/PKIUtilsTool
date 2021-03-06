package fun.personaluse.listeners;

import fun.personalacademics.model.CertificateBean;
import fun.personaluse.certdisplay.CertTable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;

@SuppressWarnings("restriction")
public class OnSelectionChangeListener implements ChangeListener<CertificateBean>{
	
	private TextArea textArea;
	private CertTable certTable;
	
	public OnSelectionChangeListener(TextArea textArea, CertTable certTable) {
		this.textArea = textArea;
		this.certTable = certTable;
	}

	@Override
	public void changed(ObservableValue<? extends CertificateBean> observable, CertificateBean oldValue,
			CertificateBean newValue) {
		// if tableview, display the overriden certificate bean string
			Object item = certTable.getSelectionModel().getSelectedItem();
			if (item != null)
				textArea.setText(item.toString());
		
	}

}
