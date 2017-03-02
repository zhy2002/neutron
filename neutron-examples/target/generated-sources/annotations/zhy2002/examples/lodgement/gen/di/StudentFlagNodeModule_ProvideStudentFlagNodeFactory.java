package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.StudentFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentFlagNodeModule_ProvideStudentFlagNodeFactory
    implements Factory<StudentFlagNode> {
  private final StudentFlagNodeModule module;

  public StudentFlagNodeModule_ProvideStudentFlagNodeFactory(StudentFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StudentFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideStudentFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StudentFlagNode> create(StudentFlagNodeModule module) {
    return new StudentFlagNodeModule_ProvideStudentFlagNodeFactory(module);
  }

  /** Proxies {@link StudentFlagNodeModule#provideStudentFlagNode()}. */
  public static StudentFlagNode proxyProvideStudentFlagNode(StudentFlagNodeModule instance) {
    return instance.provideStudentFlagNode();
  }
}
