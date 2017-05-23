export default class StaticService {
    constructor() {
        throw new Error(`Static service '${new.target.name}' cannot be initialized.`);
    }
}
