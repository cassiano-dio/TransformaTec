import useFetchData from "./useFetchData";

export default function FetchAPIData(){

    const {data} = useFetchData('https://api.github.com/users/cassiano-dio/repos')

    return(
        <div>
            {data && (
                data.map((repository) =>(
                    <div className="text-white" key={repository.id}>
                        <p> {repository.id} : {repository.name}</p>
                    </div>
                ))
            )}
        </div>
    )

}