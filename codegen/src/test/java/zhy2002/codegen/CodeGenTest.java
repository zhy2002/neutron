package zhy2002.codegen;

import org.junit.Test;
import zhy2002.neutron.CodeGenerator;

public class CodeGenTest {

    @Test
    public void test1() {
        CodeGenerator generator = new CodeGenerator();
        generator.generate("C:\\zhy\\code\\neutron\\codegen\\src\\main\\resources\\zhy2002\\neutron\\desc.yml");
    }

}
