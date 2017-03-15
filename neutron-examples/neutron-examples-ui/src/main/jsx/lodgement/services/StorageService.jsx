import axios from 'axios';
import CommonUtil from './CommonUtil';


const baseUrl = 'http://localhost:9200';

class StorageService {
}

const errorHandler = (error) => {
    CommonUtil.setIsLoading(false);
    console.log(error);
    setTimeout(() => {
        alert(error);
    }, 10);
    return window.Promise.reject(error);
};

StorageService.getApplicationSummaries = () => {
    CommonUtil.setIsLoading(true);
    return axios.get(
        `${baseUrl}/lodgement/application/_search?q=*&_source_exclude=node`
    ).then(
        (response) => {
            CommonUtil.setIsLoading(false);
            return response.data;
        },
        errorHandler
    );
};

StorageService.getApplication = id =>
    axios.get(`${baseUrl}/lodgement/application/${id}`).then(
        (response) => {
            CommonUtil.setIsLoading(false);
            return response.data['_source'].node;
        },
        errorHandler
    );

function getApplicants(model) {
    let result = ''; //todo move to variant node
    const persons = model.getPersonListNode();
    if (persons) {
        for (let i = 0; i < persons.getItemCount(); i++) {
            const p = persons.getItem(i);
            if (p) {
                result += `${p.getNodeLabel()} `;
            }
        }
    }
    return result.trim();
}

function getSummary(node, model) {
    return {
        id: node.id,
        username: 'abcd',
        applicants: getApplicants(model),
        amount: '$650,000',
        status: 'In Progress',
        updated: new Date().toISOString(),
        node
    };
}

StorageService.saveApplication = (model) => {
    CommonUtil.setIsLoading(true);
    const node = CommonUtil.extractValue(model);
    const id = node.id;
    const summary = getSummary(node, model);
    return axios.put(
        `${baseUrl}/lodgement/application/${id}`, summary
    ).then(
        (response) => {
            CommonUtil.setIsLoading(false);
            return response;
        },
        errorHandler
    );
};

export default StorageService;
