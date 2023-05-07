import SearchbarComponent from "./SearchbarComponent";
import Switch from "./toggle"
import { BiSearchAlt } from "react-icons/bi"

const SearchBar = () => {

  return (
    <header>
      <div className="flex justify-between items-center">
        <div className="flex items-center">
          <Switch />

          <div className="flex items-center">
            <SearchbarComponent placeholder="Search anything..." />
            <a href='/search'><button className="ml-4 font-xl text-black" type="submit">
              <BiSearchAlt />
            </button>
            </a>
          </div>
        </div>
      </div>
    </header>
  );
};

export default SearchBar;