export default class StaticService {
    constructor() {
        throw new Error(`Static service '${this.constructor.name}' cannot be initialized.`);
    }
}
