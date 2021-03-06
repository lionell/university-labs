// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

public final class ParcsLauncherObj_Stub
    extends java.rmi.server.RemoteStub
    implements ParcsLauncherInt, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_executeClass_0;
    private static java.lang.reflect.Method $method_executeClass_1;
    private static java.lang.reflect.Method $method_loadOutputFile_2;
    private static java.lang.reflect.Method $method_saveInputFile_3;
    
    static {
	try {
	    $method_executeClass_0 = ParcsLauncherInt.class.getMethod("executeClass", new java.lang.Class[] {java.lang.String.class, byte[].class});
	    $method_executeClass_1 = ParcsLauncherInt.class.getMethod("executeClass", new java.lang.Class[] {java.lang.String.class, byte[].class, java.util.List.class, boolean.class});
	    $method_loadOutputFile_2 = ParcsLauncherInt.class.getMethod("loadOutputFile", new java.lang.Class[] {java.lang.String.class});
	    $method_saveInputFile_3 = ParcsLauncherInt.class.getMethod("saveInputFile", new java.lang.Class[] {java.lang.String.class, byte[].class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public ParcsLauncherObj_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of executeClass(String, byte[])
    public void executeClass(java.lang.String $param_String_1, byte[] $param_arrayOf_byte_2)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_executeClass_0, new java.lang.Object[] {$param_String_1, $param_arrayOf_byte_2}, -9155023506048325891L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of executeClass(String, byte[], List, boolean)
    public void executeClass(java.lang.String $param_String_1, byte[] $param_arrayOf_byte_2, java.util.List $param_List_3, boolean $param_boolean_4)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_executeClass_1, new java.lang.Object[] {$param_String_1, $param_arrayOf_byte_2, $param_List_3, new java.lang.Boolean($param_boolean_4)}, -4731758995490322506L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of loadOutputFile(String)
    public byte[] loadOutputFile(java.lang.String $param_String_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_loadOutputFile_2, new java.lang.Object[] {$param_String_1}, -47248978019937657L);
	    return ((byte[]) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of saveInputFile(String, byte[])
    public void saveInputFile(java.lang.String $param_String_1, byte[] $param_arrayOf_byte_2)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_saveInputFile_3, new java.lang.Object[] {$param_String_1, $param_arrayOf_byte_2}, -3618588511961908974L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
