// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.expr;
import org.python.antlr.base.mod;
import org.python.antlr.base.slice;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.Call", base = AST.class)
public class Call extends expr {
public static final PyType TYPE = PyType.fromClass(Call.class);
    private expr func;
    public expr getInternalFunc() {
        return func;
    }
    @ExposedGet(name = "func")
    public PyObject getFunc() {
        return func;
    }
    @ExposedSet(name = "func")
    public void setFunc(PyObject func) {
        this.func = AstAdapters.py2expr(func);
    }

    private java.util.List<expr> args;
    public java.util.List<expr> getInternalArgs() {
        return args;
    }
    @ExposedGet(name = "args")
    public PyObject getArgs() {
        return new AstList(args, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "args")
    public void setArgs(PyObject args) {
        this.args = AstAdapters.py2exprList(args);
    }

    private java.util.List<keyword> keywords;
    public java.util.List<keyword> getInternalKeywords() {
        return keywords;
    }
    @ExposedGet(name = "keywords")
    public PyObject getKeywords() {
        return new AstList(keywords, AstAdapters.keywordAdapter);
    }
    @ExposedSet(name = "keywords")
    public void setKeywords(PyObject keywords) {
        this.keywords = AstAdapters.py2keywordList(keywords);
    }

    private expr starargs;
    public expr getInternalStarargs() {
        return starargs;
    }
    @ExposedGet(name = "starargs")
    public PyObject getStarargs() {
        return starargs;
    }
    @ExposedSet(name = "starargs")
    public void setStarargs(PyObject starargs) {
        this.starargs = AstAdapters.py2expr(starargs);
    }

    private expr kwargs;
    public expr getInternalKwargs() {
        return kwargs;
    }
    @ExposedGet(name = "kwargs")
    public PyObject getKwargs() {
        return kwargs;
    }
    @ExposedSet(name = "kwargs")
    public void setKwargs(PyObject kwargs) {
        this.kwargs = AstAdapters.py2expr(kwargs);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("func"), new PyString("args"), new PyString("keywords"), new
                     PyString("starargs"), new PyString("kwargs")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes =
    new PyString[] {new PyString("lineno"), new PyString("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public Call(PyType subType) {
        super(subType);
    }
    public Call() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void Call___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("Call", args, keywords, new String[]
            {"func", "args", "keywords", "starargs", "kwargs"}, 5);
        setFunc(ap.getPyObject(0));
        setArgs(ap.getPyObject(1));
        setKeywords(ap.getPyObject(2));
        setStarargs(ap.getPyObject(3));
        setKwargs(ap.getPyObject(4));
    }

    public Call(PyObject func, PyObject args, PyObject keywords, PyObject starargs, PyObject
    kwargs) {
        setFunc(func);
        setArgs(args);
        setKeywords(keywords);
        setStarargs(starargs);
        setKwargs(kwargs);
    }

    public Call(Token token, expr func, java.util.List<expr> args, java.util.List<keyword>
    keywords, expr starargs, expr kwargs) {
        super(token);
        this.func = func;
        addChild(func);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<expr>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.keywords = keywords;
        if (keywords == null) {
            this.keywords = new ArrayList<keyword>();
        }
        for(PythonTree t : this.keywords) {
            addChild(t);
        }
        this.starargs = starargs;
        addChild(starargs);
        this.kwargs = kwargs;
        addChild(kwargs);
    }

    public Call(Integer ttype, Token token, expr func, java.util.List<expr> args,
    java.util.List<keyword> keywords, expr starargs, expr kwargs) {
        super(ttype, token);
        this.func = func;
        addChild(func);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<expr>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.keywords = keywords;
        if (keywords == null) {
            this.keywords = new ArrayList<keyword>();
        }
        for(PythonTree t : this.keywords) {
            addChild(t);
        }
        this.starargs = starargs;
        addChild(starargs);
        this.kwargs = kwargs;
        addChild(kwargs);
    }

    public Call(PythonTree tree, expr func, java.util.List<expr> args, java.util.List<keyword>
    keywords, expr starargs, expr kwargs) {
        super(tree);
        this.func = func;
        addChild(func);
        this.args = args;
        if (args == null) {
            this.args = new ArrayList<expr>();
        }
        for(PythonTree t : this.args) {
            addChild(t);
        }
        this.keywords = keywords;
        if (keywords == null) {
            this.keywords = new ArrayList<keyword>();
        }
        for(PythonTree t : this.keywords) {
            addChild(t);
        }
        this.starargs = starargs;
        addChild(starargs);
        this.kwargs = kwargs;
        addChild(kwargs);
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "Call";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Call(");
        sb.append("func=");
        sb.append(dumpThis(func));
        sb.append(",");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("keywords=");
        sb.append(dumpThis(keywords));
        sb.append(",");
        sb.append("starargs=");
        sb.append(dumpThis(starargs));
        sb.append(",");
        sb.append("kwargs=");
        sb.append(dumpThis(kwargs));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitCall(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (func != null)
            func.accept(visitor);
        if (args != null) {
            for (PythonTree t : args) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (keywords != null) {
            for (PythonTree t : keywords) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (starargs != null)
            starargs.accept(visitor);
        if (kwargs != null)
            kwargs.accept(visitor);
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
