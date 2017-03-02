package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.ValidationErrorUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorNodeModule_ProvideValidationErrorUiNodeFactory
    implements Factory<ValidationErrorUiNode<?>> {
  private final ErrorNodeModule module;

  public ErrorNodeModule_ProvideValidationErrorUiNodeFactory(ErrorNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ValidationErrorUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideValidationErrorUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ValidationErrorUiNode<?>> create(ErrorNodeModule module) {
    return new ErrorNodeModule_ProvideValidationErrorUiNodeFactory(module);
  }

  /** Proxies {@link ErrorNodeModule#provideValidationErrorUiNode()}. */
  public static ValidationErrorUiNode<?> proxyProvideValidationErrorUiNode(
      ErrorNodeModule instance) {
    return instance.provideValidationErrorUiNode();
  }
}
