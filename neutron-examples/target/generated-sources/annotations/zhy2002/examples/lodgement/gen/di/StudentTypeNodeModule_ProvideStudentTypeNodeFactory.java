package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.StudentTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentTypeNodeModule_ProvideStudentTypeNodeFactory
    implements Factory<StudentTypeNode> {
  private final StudentTypeNodeModule module;

  public StudentTypeNodeModule_ProvideStudentTypeNodeFactory(StudentTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StudentTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideStudentTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StudentTypeNode> create(StudentTypeNodeModule module) {
    return new StudentTypeNodeModule_ProvideStudentTypeNodeFactory(module);
  }

  /** Proxies {@link StudentTypeNodeModule#provideStudentTypeNode()}. */
  public static StudentTypeNode proxyProvideStudentTypeNode(StudentTypeNodeModule instance) {
    return instance.provideStudentTypeNode();
  }
}
