package app.create.rpg;

import app.create.rpg.file.CachedFile;

public class FragmentRMFile extends AbstractFragmentPage {

	protected CachedFile mMain;
	
	public CachedFile requireMain (String name) {
		return mMain = super.require (name);
	}
	
	@Override
	public void onUpdate(CachedFile file) {
		super.onUpdate(file);
		flag (mMain.isModified());
	}

}
