package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmploymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentNodeModule_ProvideEmploymentNodeFactory
    implements Factory<EmploymentNode<?>> {
  private final PreviousEmploymentNodeModule module;

  public PreviousEmploymentNodeModule_ProvideEmploymentNodeFactory(
      PreviousEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmploymentNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideEmploymentNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmploymentNode<?>> create(PreviousEmploymentNodeModule module) {
    return new PreviousEmploymentNodeModule_ProvideEmploymentNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentNodeModule#provideEmploymentNode()}. */
  public static EmploymentNode<?> proxyProvideEmploymentNode(
      PreviousEmploymentNodeModule instance) {
    return instance.provideEmploymentNode();
  }
}