package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredSinceNodeModule_ProvideMonthYearNodeFactory
    implements Factory<MonthYearNode<?>> {
  private final RetiredSinceNodeModule module;

  public RetiredSinceNodeModule_ProvideMonthYearNodeFactory(RetiredSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthYearNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideMonthYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthYearNode<?>> create(RetiredSinceNodeModule module) {
    return new RetiredSinceNodeModule_ProvideMonthYearNodeFactory(module);
  }

  /** Proxies {@link RetiredSinceNodeModule#provideMonthYearNode()}. */
  public static MonthYearNode<?> proxyProvideMonthYearNode(RetiredSinceNodeModule instance) {
    return instance.provideMonthYearNode();
  }
}
