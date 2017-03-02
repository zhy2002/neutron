package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CurrentEmploymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentNodeModule_ProvideCurrentEmploymentNodeFactory
    implements Factory<CurrentEmploymentNode> {
  private final CurrentEmploymentNodeModule module;

  public CurrentEmploymentNodeModule_ProvideCurrentEmploymentNodeFactory(
      CurrentEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CurrentEmploymentNode get() {
    return Preconditions.checkNotNull(
        module.provideCurrentEmploymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CurrentEmploymentNode> create(CurrentEmploymentNodeModule module) {
    return new CurrentEmploymentNodeModule_ProvideCurrentEmploymentNodeFactory(module);
  }

  /** Proxies {@link CurrentEmploymentNodeModule#provideCurrentEmploymentNode()}. */
  public static CurrentEmploymentNode proxyProvideCurrentEmploymentNode(
      CurrentEmploymentNodeModule instance) {
    return instance.provideCurrentEmploymentNode();
  }
}
