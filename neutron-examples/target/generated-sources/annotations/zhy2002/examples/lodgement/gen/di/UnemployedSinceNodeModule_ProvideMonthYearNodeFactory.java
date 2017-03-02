package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedSinceNodeModule_ProvideMonthYearNodeFactory
    implements Factory<MonthYearNode<?>> {
  private final UnemployedSinceNodeModule module;

  public UnemployedSinceNodeModule_ProvideMonthYearNodeFactory(UnemployedSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthYearNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideMonthYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthYearNode<?>> create(UnemployedSinceNodeModule module) {
    return new UnemployedSinceNodeModule_ProvideMonthYearNodeFactory(module);
  }

  /** Proxies {@link UnemployedSinceNodeModule#provideMonthYearNode()}. */
  public static MonthYearNode<?> proxyProvideMonthYearNode(UnemployedSinceNodeModule instance) {
    return instance.provideMonthYearNode();
  }
}
