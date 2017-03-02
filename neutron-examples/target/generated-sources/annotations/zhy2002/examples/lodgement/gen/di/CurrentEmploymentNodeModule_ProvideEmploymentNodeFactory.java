package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmploymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentNodeModule_ProvideEmploymentNodeFactory
    implements Factory<EmploymentNode<?>> {
  private final CurrentEmploymentNodeModule module;

  public CurrentEmploymentNodeModule_ProvideEmploymentNodeFactory(
      CurrentEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmploymentNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideEmploymentNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmploymentNode<?>> create(CurrentEmploymentNodeModule module) {
    return new CurrentEmploymentNodeModule_ProvideEmploymentNodeFactory(module);
  }

  /** Proxies {@link CurrentEmploymentNodeModule#provideEmploymentNode()}. */
  public static EmploymentNode<?> proxyProvideEmploymentNode(CurrentEmploymentNodeModule instance) {
    return instance.provideEmploymentNode();
  }
}
