package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmployerNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerNameNodeModule_ProvideEmployerNameNodeFactory
    implements Factory<EmployerNameNode> {
  private final EmployerNameNodeModule module;

  public EmployerNameNodeModule_ProvideEmployerNameNodeFactory(EmployerNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmployerNameNode get() {
    return Preconditions.checkNotNull(
        module.provideEmployerNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmployerNameNode> create(EmployerNameNodeModule module) {
    return new EmployerNameNodeModule_ProvideEmployerNameNodeFactory(module);
  }

  /** Proxies {@link EmployerNameNodeModule#provideEmployerNameNode()}. */
  public static EmployerNameNode proxyProvideEmployerNameNode(EmployerNameNodeModule instance) {
    return instance.provideEmployerNameNode();
  }
}
