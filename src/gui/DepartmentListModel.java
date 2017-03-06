package gui;

import javax.swing.AbstractListModel;

import administration.Department;

@SuppressWarnings("serial")
public class DepartmentListModel extends AbstractListModel<Department> {
	
	@Override
	public Department getElementAt(int index) {
		return Department.getDepartments().get(index);
	}

	@Override
	public int getSize() {
		return Department.getDepartments().size();
	}
	
	public void fireExternalElementAdded() {
		fireIntervalAdded(this, getSize() -1, getSize());
	}

}
