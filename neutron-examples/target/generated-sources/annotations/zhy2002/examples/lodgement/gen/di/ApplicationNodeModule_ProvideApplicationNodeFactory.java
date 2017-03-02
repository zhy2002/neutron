package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeModule_ProvideApplicationNodeFactory
    implements Factory<ApplicationNode> {
  private final ApplicationNodeModule module;

  public ApplicationNodeModule_ProvideApplicationNodeFactory(ApplicationNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ApplicationNode get() {
    return Preconditions.checkNotNull(
        module.provideApplicationNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApplicationNode> create(ApplicationNodeModule module) {
    return new ApplicationNodeModule_ProvideApplicationNodeFactory(module);
  }

  /** Proxies {@link ApplicationNodeModule#provideApplicationNode()}. */
  public static ApplicationNode proxyProvideApplicationNode(ApplicationNodeModule instance) {
    return instance.provideApplicationNode();
  }
}
