package org.kirino.context;

public enum ContextKey {
	PS3,
	XBOX360;
	
	@Override
	public String toString(){
		return name().toLowerCase();
	}
}
