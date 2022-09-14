import useGithubUsers from "./useGithubUsers";

export default function FetchGithubUsers(){

    const { setQuery, results } = useGithubUsers();
    return <div>
        <input onChange={e => setQuery(e.target.value)} />
        <ul>
        <li>Loading</li>
        {
            results && results.map((item, index) => <li key={index} >{item.login}</li>)
        }
        </ul>
    </div>

}